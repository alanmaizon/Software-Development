public class SpaceFinder {
    public String getSpacePositions(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                sb.append(i).append(" ");
            }
        }
        return sb.toString().trim();
    }
}