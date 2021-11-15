package com.pb.aleksieiev.hw7;

public enum Size {
    XXS{
        void getDescription(){System.out.println("Детский размер");}
        public int getEuroSize(){ return 32;}
    },
    XS{
        void getDescription(){System.out.println("Взрослый размер");}
        public int getEuroSize(){ return 34;}
    },
    S{
        void getDescription(){System.out.println("Взрослый размер");}
        public int getEuroSize(){ return 36;}
    },
    M{
        void getDescription(){System.out.println("Взрослый размер");}
        public int getEuroSize(){ return 38;}
    },
    L{
        void getDescription(){System.out.println("Взрослый размер");}
        public int getEuroSize(){ return 40;}
    };
    private String description;
    private int euroSize;
    Size(String description, int euroSize){
        this.description = description;
        this.euroSize = euroSize;
    }
    Size(){}
}
