DROP TABLE IF EXISTS TBL_EMPLOYEE;
 
CREATE TABLE TBL_EMPLOYEE (
  id BIGINT PRIMARY KEY NOT NULL,
  fname VARCHAR(250)  NOT NULL,
  lname VARCHAR(250) NOT NULL,
  nis_num INT(250) NOT NULL,
  Week1 DOUBLE NOT NULL,
  Week2 double NOT  NULL,
  Week3 double NOT  NULL,
  Week4 double NOT NULL,
  Week5 double NOT NULL,
  Week1Nis double  NULL   ,
  Week2Nis double  NULL  ,
  Week3Nis double  NULL   ,
  Week4Nis double  NULL  ,
  Week5Nis double  NULL  ,
  Week1NisTotal double  NULL  ,
  Week2NisTotal double  NULL ,
  Week3NisTotal double  NULL  ,
  Week4NisTotal double  NULL  ,
  Week5NisTotal double  NULL  ,
  updated_at datetime NOT NULL,
  created_at datetime NOT NULL,
  
  
  PRIMARY KEY(id)  
);

INSERT INTO 
	TBL_EMPLOYEE (id,fname,lname,nis_num,Week1,Week2,Week3,Week4,Week5,Week1Nis,Week2Nis,Week3Nis,Week4Nis,Week5Nis,Week1NisTotal,Week2NisTotal,Week3NisTotal,Week4NisTotal,Week5NisTotal,updated_at,created_at) 
VALUES
  	('8522', 'Jerry', 'John','151874504','834','667','834','667','1000','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('3396', 'Smith', 'Benson','988553192','9000','300','800','400','834','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('9836', 'Randy', 'Brothe','987549872','1000','2000','3000','1000','1907','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('8555', 'Sarah', 'Chevy','989999872','1000','834','667','1000','210','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('8683', 'Patrice', 'Marshall','989283042','1000','667','834','195','834','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('5014', 'Seales', 'Church','882274018','1000','400','450','1800','789','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('9188', 'Lorie', 'Sameth','663890003','987','200','500','1000','2000','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('9117', 'Samorandy', 'Zhee','770543895','1000','490','500','1987','3000','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('5027', 'Sandra', 'Timm','483052974','1000','590','200','1298','400','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('3903', 'Yonish', 'Wendeal','986479321','1000','500','667','900','845','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
  	('3067', 'Ratilan', 'Palmer','483058383','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP())
 ;
  	
  
  
  