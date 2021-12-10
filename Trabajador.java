package TRABAJADORES;

public class Trabajador extends Persona{
        private String id;
        private double sueldo;
        private String puesto;
        
        public Trabajador(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String genero,
                String id, double sueldo, String puesto) {
            super(nombre, apellidoPaterno, apellidoMaterno, edad, genero);
            this.id = id;
            this.sueldo = sueldo;
            this.puesto = puesto;
        }

        
        public Trabajador(){
            this.id = "";
            this.sueldo = 0;
            this.puesto = "";
        }
        // public Trabajador(Trabajador t){
        //         super( t.getNombre(),t.getApellidoPaterno() , t.getApellidoMaterno(),t.getEdad() ,t.getGenero());
        //         this.id= t.getId();
        //         this.sueldo = t.getSueldo();
        //         this.puesto= t.getPuesto();
        // }
        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public double getSueldo() {
                return sueldo;
        }

        public void setSueldo(double sueldo) {
                this.sueldo = sueldo;
        }

        public String getPuesto() {
                return puesto;
        }

        public void setPuesto(String puesto) {
                this.puesto = puesto;
        }
        /**
         * Metodo para mostrar información del trabajador.
         */
        @Override
        public String toString(){
                //nombre, apellidoPaterno,  apellidoMaterno, edad,  genero, id,  sueldo,  puesto
        return getId()+"\t"+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" ("+getEdad()+") "+getGenero()+"  $"+getSueldo()+" ["+getPuesto()+"]";
        }
}
