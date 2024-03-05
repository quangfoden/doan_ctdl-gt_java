package Dslkkep;

import java.util.Scanner;
public class DLinkList {
	 public DoubleLink first,last;
	 		DoubleLink q =null;DoubleLink p=null;
	       DLinkDao obj=new DLinkDao();
	    //LinkList constructor
	   public DLinkList() { 
	    	first=null	;  last=null;
	    	}
	    public void insert(String maSV, String hoTen, double diem)
	    {
	        DoubleLink nut=new DoubleLink(maSV, hoTen, diem);
	        if ((last==null)&&(first==null)) {last=nut;first=nut;}
	        else {last.next=nut;
	        		nut.prev=last;
	        		last=nut;
	        	 }
	        }
	 
	    public void  ghiFile()
        {
	    	insert("a1", "Dung", 8);
	    	insert("a2", "Hoa", 8);
	    	obj.ghiFile(first);
        }
	    public void  docFile()
	    {
	    	first=obj.docFile("d:\\thi3.bin");
	    }
	    public void printList() {
            DoubleLink p = first;
            while(p != null) {
                System.out.println(p.getMaSV()+" "+p.getHoTen()+ "; "+ p.getDiem()+"; "+p.getKq());
                p = p.next;
            }
       }
	    public void printList1() {
            DoubleLink p = last;
            while(p != null) {
                System.out.println(p.getMaSV()+" "+p.getHoTen()+ "; "+ p.getDiem()+"; "+p.getKq());
                p = p.prev;
            }
                    }
	  /*  public void printIf()
	    {
	    	Link p= first;
	    	while (p!=null)
	    	{
	    		if(p.getDiem()>=5)
	    			System.out.println(p.getMaSV()+" "+p.getHoTen()+"  "+p.getDiem()+"  "+p.getKq());
	    		p=p.nextLink;
	    	}
	    }
	    public void kq()
	    {
	    	Link p =first;
	    	while (p!=null)
	    	{ if(p.getDiem()>=5)p.setKq("Dau");
	    	  else p.setKq("Rot");
	    	  p=p.nextLink;
	    	}
	    	
	    }
	    public double max()
	    {
	    	Link p=first; double ln=first.getDiem();
	    	while (p!=null)
	    	{
	    		if(ln<p.getDiem()) ln=p.getDiem();
	    		p=p.nextLink;
	    	}
	    	return ln;
	    }
	    public Link search(String maSV)
	    { Link p=first;
	      while ((p!=null)&&(p.getMaSV().equals(maSV)!=true))
	      {
	    	  p=p.nextLink;
	      }
	    	return(p);
	    }
	    public void search1(String hoTen)
	    {
	    	Link p=first;
	    	while (p!=null)
	    	{
	    		if(p.getHoTen().equals(hoTen)==true)
	    		{System.out.println(p.getMaSV()+"; "+p.getHoTen());}
	    		p=p.nextLink;
	    	}
	    	
	    }
	   public void delete(String maSV)
	   {
		   Link p= search(maSV);
		   if(p!=null)
		   {   
			   if (p==first) {first=first.nextLink; ;}
			   else
				   {Link q=first;
				     while ((q.nextLink!=p)&&(q!=null)) q=q.nextLink;
		    	    q.nextLink=p.nextLink;
		    	   
		           }
	   }
}
	   public void sort()
	    {Link p, q;
	    String ht, maSV;double diem;
	     p=first; 
	     while(p!=null)
	     {q=p.nextLink;
	    	while (q!=null)
	         {if (p.getHoTen().compareTo(q.getHoTen())>0) 
	          {  ht=q.getHoTen();diem=q.getDiem(); maSV=q.getMaSV();
	        	 q.setMaSV(p.getMaSV());q.setHoTen(p.getHoTen()); q.setDiem(p.getDiem());
	        	 p.setMaSV(maSV);p.setHoTen(ht); p.setDiem(diem);
	          		
	         }
	         	 q=q.nextLink;
	       }
	    	 p=p.nextLink;
	     }
	    
	    }*/
}