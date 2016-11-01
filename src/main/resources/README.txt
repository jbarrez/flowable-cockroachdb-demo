* Download latest CockroachDB tarball
* Untar and run: ./cockroachdb start
* ./cockroach start --store=node2 --port=26258 --http-port=8081 --join=localhost:26257 
* 
* Admin UI is running on http://localhost:8080/
* Create a database and a user: ./cockroachdb sql
* Execute following statements:
    * CREATE DATABASE flowable;
    * GRANT ALL ON DATABASE flowable TO maxroach;
* CockroachDB hasn't implemented the 'jdbc metadata' yet, which means the Flowable auto-schema creation won't work.  
* Manually create the schema (simplified engine sql script, without foreign keys):

sql=$(wget https://raw.githubusercontent.com/jbarrez/flowable-cockroachdb-demo/master/engine-schema.sql -q -O -)
./cockroach sql --database=flowable --user=maxroach -e "$sql"


---------------------------------------------------------------------------------------------------------    
 Tested on CockroachDB with following version (./cockroachdb version):

Build Tag:   beta-20161027
Build Time:  2016/10/27 13:34:56
Platform:    linux amd64
Go Version:  go1.7.3
C Compiler:  gcc 4.9.2
    