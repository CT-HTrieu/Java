import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Word {
    private String word, mean;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
    
    
    public Word(){
        this.word="";
        this.mean="";
    }

    public Word(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }
    
    public void input(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap tu: ");
        word=scn.nextLine();
        System.out.print("Nhap nghia: ");
        mean=scn.nextLine();
    }
    public void output(){
        System.out.println(word+ " : "+mean);
    }
}
 class WordList {
    ArrayList<Word> list = new ArrayList<Word>();
    
    public void input(){
        Word word = new Word();
        word.input();
        list.add(word);
    }
    public void output(){
        for( Word i:list){
            i.output();
        }
    }
    public Word searchWord(String word){
        for(Word i:list){
            if(i.getWord().equals(word)){
                return i;
            }
        }
        return null;
    }
    public void fixMean(String word){
        Scanner scn= new Scanner(System.in);
             String newMean;
             int c = list.indexOf(searchWord(word));
             if(c>-1){
                 System.out.print("Nhap nghĩa của từ: ");
                 newMean=scn.nextLine();
                 list.get(c).setMean(newMean);
             }
    }
    public void removeWord(String word){
        Scanner scn = new Scanner(System.in);
        int c = list.indexOf(searchWord(word));
            list.remove(c);
    }
    Comparator<Word> comp = new Comparator<Word>() {
        @Override
        public int compare(Word o1, Word o2) {
            return o1.getWord().compareTo(o2.getWord());
        }
    };
}
public class Array {
     public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        WordList ds = new WordList();
        int sl;
        String searchword, fixWord;
        System.out.print("So luong tu muon them: ");
        sl=scn.nextInt();
        scn.nextLine();
        for(int i =0 ; i<sl ;i++){
            ds.input();
        }
        ds.output();
        //Search the word
        System.out.print("Nhap tu can tra nghia:  ");
        searchword=scn.nextLine();
        System.out.println(searchword +" : "+ ds.searchWord(searchword).getMean());
        //tim sua tu dien theo tu
        System.out.print("Nhap tu can sua nghia: ");
        fixWord=scn.nextLine();
        ds.fixMean(fixWord);
        ds.output();     
        //Sắp xếp
        Collections.sort(ds.list, ds.comp);
        ds.output(); 
        //Xoa mot tu
        ds.removeWord("eat");
        ds.output();
    }
}
