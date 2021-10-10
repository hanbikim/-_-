abstract class PairMap {
    protected String KeyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap{
    private int n;
    public Dictionary(int num){
        KeyArray = new String[num];
        valueArray = new String[num];
        this.n=0;
    }
    String get(String key){
        for(int i=0; i<KeyArray.length;i++){
            if(key.equals(KeyArray[i]))
                return valueArray[i];
        }
        return null;
    }
    void put(String key, String value){
        for(int i=0; i<KeyArray.length; i++) {
            if (key.equals(KeyArray[i])) {
                KeyArray[i] = key;
                valueArray[i] = value;
                return;
            }
        }
        KeyArray[n] = key;
        valueArray[n] = value;
        n++;
    }
    String delete(String key){
        for(int i=0; i<KeyArray.length; i++) {
            if(key.equals(KeyArray[i])) {
                String s = valueArray[i];
                KeyArray[i] = null;
                valueArray[i] = null;
                return s;
            }
    }
        return null;
    }
    int length(){
        return n;
    }

}
public class practice10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
