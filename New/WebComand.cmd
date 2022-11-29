cd C:\Users\Nikita\Desktop\212022\2011\ICanDoIt\BuildWebGL\

openssl genrsa 2048 > key.pem

openssl req -x509 -days 365 -new -key key.pem -out cert.pem
Ru
Rus
Rus
Rus
Rus
Rus
Rus
http-server --ssl -c-1 -p 8080 -a 127.0.0.1
