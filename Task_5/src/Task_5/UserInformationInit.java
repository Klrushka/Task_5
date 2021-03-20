package Task_5;


public class UserInformationInit {
    public static void main(String[] args) {
        UserInformation testInPack = new UserInformation();
        testInPack.name = "David";      // public
        testInPack.number = "87559985"; // default
        //testInPack.address = "Iu 78"; //private
        testInPack.glyph = "kk";        // protected

    }
}
