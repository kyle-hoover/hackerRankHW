public class Encrypter extends Validator {
    public String getEncryptedName(String name){
        validate(name);
        if (validate(name) == true) {
            name.toLowerCase();
            String newName;
            for (int i = name.length() - 1; i >= 0; i--){
                newName = append(name.charAt(i));
            }
        }
    }
}
 
class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        
        return true;
    }
}

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    
    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();
        
        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
