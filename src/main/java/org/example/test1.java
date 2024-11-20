package org.example;

public class test1 {
    public static void main(String args[]){
        myInter ab=(r)->{
       //     r.f();
        };

//        myInter ab = realme::f;


        realme obj1=new realme();

        ab.byBy(new realme());

//        myInterType2 obj=(l)-> obj1.f(l);

        myInterType2 obj11=obj1::f ;
        obj11.my("abcsssss");

        myInterType2 obj22=(r)->{
          realme.add(r);
        };
        obj22.my("rrr");

        myInterType2 objStat=realme::add;
        objStat.my("lll");


        myInterType2 obj33=(a)->{
            constFer o=new constFer(a);
        };
        obj33.my("aa");

        myInterType2 obj44=constFer::new;
        obj44.my("bb");

    }

}
