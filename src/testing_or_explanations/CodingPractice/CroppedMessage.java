package testing_or_explanations.CodingPractice;
// cropped message based on k input, but without cutting words in the middle
//example-> the quick brown fox jumps over the lazy dog / answer->the quick brown fox jumps over the lazy
//codility we test coders ->codility we

public class CroppedMessage {
    public static String croppedMessage(String str, int k) {

        String cropped="";
        if(str.length()>k){
            cropped=str.substring(0,k+1);
            if(cropped.charAt(k)==' '){
                cropped=str.substring(0,k);
            }else {
                int lastIndex=cropped.lastIndexOf(" ");
                cropped=str.substring(0,lastIndex);
            }
        }else if(str.length()==k){cropped=str;}

        return cropped;
    }

    public static void main(String[] args) {
        System.out.println(croppedMessage("codility we test coders", 14));
    }
}
