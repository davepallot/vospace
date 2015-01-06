use vospace;
truncate table nodes;
truncate table properties;
truncate table jobs;
truncate table transfers;
truncate table results;
insert into nodes(identifier, type, location, creationDate, node) values('vos://nvo.caltech!vospace', 3, 'file:///Users/mjg/Projects/noao/vospace/data', now(), '<node xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="vos:ContainerNode" uri="vos://nvo.caltech!vospace" xmlns="http://www.ivoa.net/xml/VOSpace/v2.0"> <properties/> <accepts/> <provides/> <capabilities/> <nodes/> </node>');
insert into nodes(identifier, type, location, creationDate, node) values('vos://nvo.caltech!vospace/node12', 2, 'file:///Users/mjg/Projects/noao/vospace/data/node12', now(), '<node xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="vos:DataNode" uri="vos://nvo.caltech!vospace/node12" xmlns="http://www.ivoa.net/xml/VOSpace/v2.0"> <properties/> <accepts/> <provides/> <capabilities/> </node>');
