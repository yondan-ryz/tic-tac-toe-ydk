
import java.util.Scanner;

public class TikTakToeYdk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sa = 0;
        int sb = 0;
        int sc = 0;
        int sd = 0;
        int se = 0;
        int sf = 0;
        int sg = 0;
        int sh = 0;
        int si = 0;

        String a = "1 Menang";
        String b = "2 Menang";

        boolean ulang = true;

        int giliran = 1;

        System.out.println("TIC TAC TOE Java By Dani Sykes");
        System.out.println("NB: Jika anda merasa anda menang biarkan pemain lain memasukan 1 kali..");
        if (ulang == true) {
            for (int i = 1; i < 100; i++) {
                System.out.print(sa);
                System.out.print(sb);
                System.out.println(sc);
                System.out.print(sd);
                System.out.print(se);
                System.out.println(sf);
                System.out.print(sg);
                System.out.print(sh);
                System.out.println(si);

                System.out.print("Masukan letak = (1/9)");
                int masuk = input.nextInt();

                if (giliran == 1) {
                    switch (masuk) {
                        case 1:
                            if (sa == 0) {
                                sa = 1;
                            } else if (sa == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 2:
                            if (sb == 0) {
                                sb = 1;
                            } else if (sb == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 3:
                            if (sc == 0) {
                                sc = 1;
                            } else if (sc == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 4:
                            if (sd == 0) {
                                sd = 1;
                            } else if (sd == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 5:
                            if (se == 0) {
                                se = 1;
                            } else if (se == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 6:
                            if (sf == 0) {
                                sf = 1;
                            } else if (sf == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 7:
                            if (sg == 0) {
                                sg = 1;
                            } else if (sg == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 8:
                            if (sh == 0) {
                                sh = 1;
                            } else if (sh == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        case 9:
                            if (si == 0) {
                                si = 1;
                            } else if (si == 9) {
                                System.err.println("Lokasi Salah, Game Selesai, Mohon Run Ulang");
                            }
                            giliran = 2;
                            break;
                        //Default case statement  
                        default:
                            System.out.println("Not in 10, 20 or 30");
                    }
                    System.out.println("Giliran" + giliran);
                } else if (giliran == 2) {
                    switch (masuk) {
                        case 1:
                            sa = 9;
                            giliran = 1;
                            break;
                        case 2:
                            sb = 9;
                            giliran = 1;
                            break;
                        case 3:
                            sc = 9;
                            giliran = 1;
                            break;
                        case 4:
                            sd = 9;
                            giliran = 1;
                            break;
                        case 5:
                            se = 9;
                            giliran = 1;
                            break;
                        case 6:
                            sf = 9;
                            giliran = 1;
                            break;
                        case 7:
                            sg = 9;
                            giliran = 1;
                            break;
                        case 8:
                            sh = 9;
                            giliran = 1;
                            break;
                        case 9:
                            si = 9;
                            giliran = 1;
                            break;
                        //Default case statement  
                        default:
                            System.out.println("Not in 10, 20 or 30");
                    }

                    System.out.println("Giliran" + giliran);
                }
                if (giliran == 1) {
                    if (sa == 1 && sb == 1 && sc == 1) {
                        System.out.println(a);
                        break;
                    } else if (sd == 1 && se == 1 && sf == 1) {
                        System.out.println(a);
                        break;
                    } else if (sg == 1 && sh == 1 && si == 1) {
                        System.out.println(a);
                        break;
                    } else if (sa == 1 && sd == 1 && sg == 1) {
                        System.out.println(a);
                        break;
                    } else if (sb == 1 && se == 1 && sh == 1) {
                        System.out.println(a);
                        break;
                    } else if (sc == 1 && sf == 1 && si == 1) {
                        System.out.println(a);
                        break;
                    } else if (sa == 1 && se == 1 && si == 1) {
                        System.out.println(a);
                        break;
                    } else if (sg == 1 && se == 1 && sc == 1) {
                        System.out.println(a);
                        break;
                    }
                } else if (giliran == 2) {
                    if (sa == 9 && sb == 9 && sc == 9) {
                        System.out.println(b);
                        break;
                    } else if (sd == 9 && se == 9 && sf == 9) {
                        System.out.println(b);
                        break;
                    } else if (sg == 9 && sh == 9 && si == 9) {
                        System.out.println(b);
                        break;
                    } else if (sa == 9 && sd == 9 && sg == 9) {
                        System.out.println(b);
                        break;
                    } else if (sb == 9 && se == 9 && sh == 9) {
                        System.out.println(b);
                        break;
                    } else if (sc == 9 && sf == 9 && si == 9) {
                        System.out.println(b);
                        break;
                    } else if (sa == 9 && se == 9 && si == 9) {
                        System.out.println(b);
                        break;
                    } else if (sg == 9 && se == 9 && sc == 9) {
                        System.out.println(b);
                        break;
                    }
                }

            }
        } else {
            System.out.println("Error");
        }

    }

}
