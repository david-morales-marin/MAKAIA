package org.example.PatronFactory2;

//En MAKAIA requerimos de la implementación
// de la funcionalidad de un modulo encargado
//de la facturación para los procesos de la compañía
//Es esencial que las facturas puedan estar asociadas
// a el IVA del año en curso 19 o que
//se asocien a una facturación especial en la cual
// podrán realizarse facturas con IVA reducido
//8 según los beneficios y excepciones legales

public interface Facturacion {

    void calcular();


}
