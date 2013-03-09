create table assetorganization (serialnumber varchar(25), organizationname varchar(25));

create table assetdetails
(
serialnumber varchar(25),
modelnumber varchar(25),
region varchar(25),
country varchar(25),
location varchar(25),
color varchar(25),
size  varchar(25),
language varchar(25)
);

create table alarms
(
serialnumber varchar(25),
modelnumber varchar(25),
deviceid varchar(25),
name varchar(25),
description varchar(255),
severity varchar(25),
);

create table dataitems
(
name varchar(255),
value varchar(255),
serialnumber varchar(25)
);
create table assets
(
serialnumber varchar(25),
modelnumber varchar(25),
deviceid varchar(25),
registrationdate varchar(50)
);

insert into assetdetails values('train1','IntegrationTrainingModel','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel','NA','US','HQ','BLUE','LARGE','EN');


insert into assetdetails values('train1','IntegrationTrainingModel1','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel1','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel1','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel1','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel1','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel1','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel2','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel2','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel2','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel2','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel2','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel2','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel3','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel3','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel3','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel3','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel3','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel3','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel3','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel3','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel3','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel3','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel3','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel3','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel4','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel4','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel4','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel4','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel4','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel4','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel5','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel5','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel5','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel5','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel5','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel5','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel6','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel6','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel6','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel6','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel6','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel6','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel7','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel7','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel7','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel7','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel7','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel7','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel8','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel8','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel8','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel8','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel8','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel8','NA','US','HQ','BLUE','LARGE','EN');

insert into assetdetails values('train1','IntegrationTrainingModel9','EMEA','GERMANY','HQ','RED','LARGE','DE');
insert into assetdetails values('train2','IntegrationTrainingModel9','EMEA','GERMANY','HQ','BLUE','LARGE','DE');
insert into assetdetails values('train3','IntegrationTrainingModel9','EMEA','FRANCE','HQ','BLUE','LARGE','FR');
insert into assetdetails values('train4','IntegrationTrainingModel9','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train5','IntegrationTrainingModel9','NA','US','HQ','BLUE','LARGE','EN');
insert into assetdetails values('train6','IntegrationTrainingModel9','NA','US','HQ','BLUE','LARGE','EN');
