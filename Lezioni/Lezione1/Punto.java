class Punto{
    private float y;
    private float x;
    private String name;
    // Costruttori
    Punto(float x, float y){
        this.x=x;
        this.y=y;
    }
    Punto(float x, float y, String name){
        this.x=x;
        this.y=y;
        this.name=name;
    }
    // Costruttore vuoto
    Punto(){
        this.x=0;
        this.y=0;
    }
    // Costruttore copia
    Punto(Punto p){
        this.x=p.getX();
        this.y=p.getY();
    }
    // Metodi

        //  Getters 
        public float getX(){
            return this.x;
        }
        public float getY(){
            return this.y;
        }
        public String getName(){
            return this.name;
        }
        // Setters
        public void setX(float x){
            this.x=x;
        }
        public void setY(float y){
            this.y=y;
        }
        public boolean setName(String name){
            if(name.length()==0){
                return false;
            }
            this.name=name;
            return true;
        }

        // distanza tra due punti 
        
}