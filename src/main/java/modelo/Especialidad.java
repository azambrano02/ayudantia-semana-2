package modelo;

public enum Especialidad {
    SUSPENSO("Suspenso"),
    CIENCIA_FICCION("Ciencia Ficcion"),
    TERROR("Terror"),
    AUTO_AYUDA("Auto Ayuda");

    private String especialidad;

    Especialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return especialidad;
    }
}
