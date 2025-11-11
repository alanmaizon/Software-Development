public class VowelReplace {
    public String replaceVowels(String str) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for(char c:str.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                sb.append('!');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}