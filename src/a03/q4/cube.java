package a03.q4;
class cube{

    float side;
    cube (float s ){
        
        side = s;
    }

    void calVolume(){
        float volume;
        volume = (float) Math.pow(side,3);
        System.out.println("Volume of the cube is :" + volume);
    }
}
