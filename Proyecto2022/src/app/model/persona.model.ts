export class persona{
    id?: number;
    nombre:String;
    apellido: String;
    fotoPerfil: String;

    constructor(nombre:String, apellido: String,fotoPerfil: String){
this.nombre = nombre;
this.apellido = apellido;
this.fotoPerfil = fotoPerfil;
    }
}