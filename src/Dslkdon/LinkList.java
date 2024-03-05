package Dslkdon;

import java.util.Scanner;


public class LinkList {
	public Link first;
	LinkDao obj=new LinkDao();
    //LinkList constructor
    public LinkList() {
        first = null;
       
    }
        public void insert(String maSV, String hoten, double diem) {
           	Link nut = new Link(maSV, hoten, diem);
    	    nut.nextLink = first;
    	    first = nut;    }
        
        public void ghifile()
        {	insert("01", "Anh A", 9);
        	insert("02","Anh B", 4);	
        	obj.ghiFile(first);
        }
        public void docfile()
    	{
    				first= obj.docFile("d:\\thi2.bin");
    	}
        public void printList() {
            Link p = first;
         //   System.out.print("List: ");
            while(p != null) {
                System.out.println(p.getMaSV()+"; "+p.getHoten()+ "; "+ p.getDiem()+"; "+p.getKq());
                p = p.nextLink;
            }
            System.out.println("");
        }
      public void kq()
        {
        	Link p=first;
        	while (p!=null)
        	{
        		if(p.getDiem()>=5) p.setKq("dau");
        		else p.setKq("Rot");
        		p=p.nextLink;
        	}
        }
        public void chendau(String maSV, String hoTen, double diem)
        {
        	insert(maSV, hoTen, diem);
        }
        public void chencuoi(String maSV, String hoTen, double diem)
        {
        	Link  p=first;
        	Link nut=new Link(maSV, hoTen, diem);
        	while (p.nextLink!=null) p=p.nextLink;
        	p.nextLink=nut;
        	
        }
        public void thongke()
        {
        	Link p=first; int dg=0, dk=0, dtb=0, dkem=0;
        	while(p!=null)
        	{
        		if(p.getXl().equals("gioi")==true) dg++;
        		if(p.getXl().equals("kha")==true) dk++;
        		if(p.getXl().equals("tb")==true) dtb++;
        		if(p.getXl().equals("kem")==true)dkem++;
        		p=p.nextLink;
        	}
        	System.out.println("So luong hoc sinh gioi la:"+dg);
        	System.out.println("So luong hoc sinh kha la:"+dk);
        	System.out.println("So luong hoc sinh TB la:"+dtb);
        	System.out.println("So luong hoc sinh kem la:"+dkem);
        }
}
        
       
