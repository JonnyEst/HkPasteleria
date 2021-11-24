export interface Cake {
    id?: number;
    nombre: string;
    tipo: string;
    peso: number;
    especificacion: string;
    descripcion: string;
    pastelero: string;
    img: String;
    fecha_inicio: Date;
    fecha_fin: Date;
    created_at?: Date;
}