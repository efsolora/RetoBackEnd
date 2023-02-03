# RetoBackEnd

Para la solucion del reto, se planteo la logica de la siguiente manera. Hay una empresa de transporte que tiene buses disponibles con su respectivo destino y horario.
Se pueden crear buses para el destido que la empresa necesite, Se puede crear pasajeros con un destino y si hay buses disponibles con ese destino el pasajaro ingresa a ese bus.
La terminal tiene el manejo de los registros de las parsonas que viajan en los buses y el registro de los buses que salen con pasajeros con su respectiva informacion.


Para la ejecucion del programa se utiliza postman con la siguiente informacion.

PasajeroController:

Para ver los pasajeros que estan en los buses.

metodo get = localhost:3000/api/v1/rest/bring/all

Se ve de esta forma:
{
        "nombre": "anres",
        "cc": 100,
        "idPasajero": "1d1c21ca-ffdc-4bca-a78a-541c6528b64f",
        "destino": "barranquilla"
    }
    
    
Metodo Post = localhost:3000/api/v1/rest

Paara crear un pasajero y asignarle un bus con el mismos destino del pasajero

Se crea de esta forma:

{
    "nombre" : "andres",
    "cc" : 100,
    "destino" : "barranquilla"
}


BusController:

Metodo get: localhost:3000/api/v1/bring

Para ver los buses disponibles y los que se creen.

Se ve de esta forma:

{
        "idBus": "f58d4327-07fb-47a2-8e15-38a116a17c04",
        "destinoBus": "marinilla",
        "numeroPasajeros": 30,
        "horarioBus": "2023/02/4:12:00",
        "pasajeros": []
    }
    
    
Metodo POST: localhost:3000/api/v1

Se crea el bus que se quiere agregar a la los disponibles.

Se crea de esta forma:

{
        "destinoBus": "BARRANQUILLA",
        "numeroPasajeros": 30,
        "horarioBus": "2023/02/4:00:00",
        "pasajeros": []
    }

TerminalController:

Metodo GET: localhost:3000/api/bring

Se ve el registro de los pasajeros que viajaron.

Se ve de esta forma:

[
    {
        "nombre": "andres",
        "cc": 100,
        "idPasajero": "07d75390-ac56-457f-ae66-a80772aa9a70",
        "destino": "barranquilla"
    }
]

Metodo GET: localhost:3000/api/bring2

Se vel registro de los buses que salieron con pasajeros.

Se ve e esta forma:

{
        "idBus": "4436dc5c-0dae-403b-b38a-7c7988662ba4",
        "destinoBus": "barranquilla",
        "numeroPasajeros": 30,
        "horarioBus": "2023/02/4:00:00",
        "pasajeros": [
            {
                "nombre": "andres",
                "cc": 100,
                "idPasajero": "07d75390-ac56-457f-ae66-a80772aa9a70",
                "destino": "barranquilla"
            }
        ]
    }





