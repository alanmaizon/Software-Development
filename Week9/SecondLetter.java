public class SecondLetter {
    public String getSecondLetter(String str) {
        StringBuilder sb=new StringBuilder();
        String[] words=str.split(" ");
        for(String w : words){
            if(w.length()>=2){
                sb.append(w.charAt(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }
}