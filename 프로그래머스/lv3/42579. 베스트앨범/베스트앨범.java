
import java.util.*;

class GenreInfo implements Comparable<GenreInfo>{
    String genre;
    int sum;
    int count;
    int[] best = new int[2];
    
    GenreInfo(String genre){
        this.genre = genre;
        best[0] = -1;
        best[1] = -1;
    }
    int getSum(){return sum;}
    
    @Override
    public int compareTo(GenreInfo rhs){
        int compareQuantity = rhs.getSum();
        
        return compareQuantity - this.sum;
    }
}

class MusicInfo implements Comparable<MusicInfo>{
    int id;
    String genre;
    int playCount;
    
    MusicInfo(int id, String genre, int playCount){
        this.id = id;
        this.genre = genre;
        this.playCount = playCount;
    }
    
    int getPlayCount(){return playCount;}
    
    @Override
    public int compareTo(MusicInfo rhs){
        int compareQuantity = rhs.getPlayCount();
        return compareQuantity - this.playCount;
    }
}


class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        MusicInfo[] musicInfo = new MusicInfo[genres.length];
        HashMap<String, GenreInfo> hm = new HashMap<>();
        GenreInfo[] genreInfo;
        
        for(int i = 0; i < genres.length; i++){
            musicInfo[i] = new MusicInfo(i,genres[i],plays[i]);
            
            if(!hm.containsKey(genres[i])){
                GenreInfo genre = new GenreInfo(genres[i]);
                hm.put(genres[i], genre);
            }
        }
        
        Arrays.sort(musicInfo);
        
        for(MusicInfo music : musicInfo){
            GenreInfo genre = hm.get(music.genre);
            genre.sum += music.playCount;
            
            if(genre.count < 2)
                genre.best[genre.count] = music.id;
            
            genre.count++;
        }
        
        genreInfo = new GenreInfo[hm.size()];
        int idx = 0;
        int musicCount = 0;
        
        for(String key : hm.keySet()){
            genreInfo[idx] = hm.get(key);
            musicCount += Math.min(genreInfo[idx].count,2);
            idx++;
        }
        
        Arrays.sort(genreInfo);
        
        answer = new int[musicCount];
        idx = 0;
        for(GenreInfo genre : genreInfo){
            int limit = Math.min(genre.count, 2);
            for(int i = 0; i < limit; i++, idx++){
                answer[idx] = genre.best[i];
            }
        }
        
        return answer;
        
        
    }
}