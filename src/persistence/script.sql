drop database angung;
create database angung;
use angung;

 create table pessoa(codigo int primary key auto_increment,
    nome varchar (50) , sexo enum ('m','f') , idade int);
    
     insert into pessoa values (null, 'luis','m', 20);
     insert into pessoa values (null, 'juliana','f', 16);
     insert into pessoa values (null, 'minimim','m', 30);
     insert into pessoa values (null, 'feio','m', 44);
     insert into pessoa values (null, 'ilan','m', 22);

commit;
   select * from pessoa;
   
   
   