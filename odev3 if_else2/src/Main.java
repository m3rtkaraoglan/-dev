//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double vize1 = 60.0;
    double vize2 = 70.0;
    double final1 = 75.0;
    double ort = vize1 / 4 + vize2 / 4 + final1 / 2;
    System.out.println(ort);
    if (ort>=85){
        System.out.println("Geçtin ve takdir belgesi aldın.");
    }else if (ort>=75){
        System.out.println("Geçtin ve teşekkür belgesi aldın.");
    }else if (ort>=50){
        System.out.println("Geçtin ama belge almadın");
    }else{
        System.out.println("Kaldın.");
    }
}


