import java.util.Scanner;
public class burclar {
    public static void main(String[] args) {
        int ay, gun;
        boolean isError = false;
        String burc="";

        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı Ayda Doğdunuz: ");
        ay = input.nextInt();
        System.out.print("Ayın Kaçıncı Gününde Doğdunuz: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc="Oğlak";
                } else {
                    burc="Kova";
                }
            } else {
                isError = true;
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 20) {
                    burc="Kova";
                } else {
                    burc="Balık";
                }
            } else {
                isError = true;
            }

        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 20) {
                    burc="Balık";
                } else {
                    burc="Koç";
                }
            } else {
                isError = true;
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 20) {
                    burc="Koç";
                } else {
                    burc="Boğa";
                }
            } else {
                isError = true;
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    burc="Boğa";
                } else {
                    burc="İkizler";
                }
            } else {
                isError = true;
            }
        }else if (ay == 6) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc="İkizler";
                } else {
                    burc="Yengeç";
                }
            } else {
                isError = true;
            }
        }else if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc="Yengeç";
                } else {
                    burc="Aslan";
                }
            } else {
                isError = true;
            }
        }else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc="Aslan";
                } else {
                    burc="Başak";
                }
            } else {
                isError = true;
            }
        }else if (ay == 9) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc="Başak";
                } else {
                    burc="Terazi";
                }
            } else {
                isError = true;
            }
        }else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc="Terazi";
                } else {
                    burc="Akrep";
                }
            } else {
                isError = true;
            }
        }else if (ay == 11) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    burc="Akrep";
                } else {
                    burc="Oğlak";
                }
            } else {
                isError = true;
            }
        }
        if (isError){
            System.out.print("Hatalı Giriş Yapıldı");
        }
        else{
            System.out.print("Burcunuz: "+ burc);
        }
    }
}
