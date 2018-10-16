/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

/**
 *
 * @author CCNP
 */
public class Tuan5 {

    
        private int giaban;
        private String nguongoc;
        private String ngaynhap;
        private int soluong;

        public int getGiaban() {
            return giaban;
        }

        public void setGiaban(int giaban) {
            this.giaban = giaban;
        }

        public String getNguongoc() {
            return nguongoc;
        }

        public void setNguongoc(String nguongoc) {
            this.nguongoc = nguongoc;
        }

        public String getNgaynhap() {
            return ngaynhap;
        }

        public void setNgaynhap(String ngaynhap) {
            this.ngaynhap = ngaynhap;
        }

        public int getSoluong() {
            return soluong;
        }

        public void setSoluong(int soluong) {
            this.soluong = soluong;
        }
       public static class Quacam extends Tuan5{
           
        }
        public static class CamSanh extends Quacam{
            
        }
       public static class CamCaophong extends Quacam{
            
        }
        public static class Quatao extends Tuan5{
            
        }
        
    public static void main(String[] args) {
        CamSanh cam;
            cam = new CamSanh();
        
        
    }
    
}