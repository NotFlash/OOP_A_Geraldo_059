public class Codelab1Modul2 {
    public static void main(String[] args) {

        Animal Animal1 = new Animal();
        Animal Animal2 = new Animal();

        Animal1.Name = "Cat";
        Animal1.Type = "Mammal";
        Animal1.Sound = "WaWaWaaa";

        Animal2.Name = "Dog";
        Animal2.Type = "Mammal";
        Animal2.Sound = "WOFF-WOOOFFF";

        Animal1.displayinfo();
        Animal2.displayinfo();
    }
}

