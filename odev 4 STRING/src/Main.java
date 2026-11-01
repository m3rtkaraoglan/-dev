void main() {
    double vize1 = (double)60.0F;
    double vize2 = (double)70.0F;
    double final1 = (double)75.0F;
    double ort = vize1 / (double)4.0F + vize2 / (double)4.0F + final1 / (double)2.0F;
    System.out.println(ort);
    if (ort >= (double)85.0F) {
        String ad1=("Geçtin ve takdir belgesi aldın.");
        System.out.println(ad1);
    } else if (ort >= (double)75.0F) {
        String ad2=("Geçtin ve takdir belgesi aldın.");
        System.out.println(ad2);
    } else if (ort >= (double)50.0F) {
        String ad3=("Geçtin ama belge almadın");
        System.out.println(ad3);
    } else {
        String ad4=("Kaldın.");
        System.out.println(ad4);
    }

}