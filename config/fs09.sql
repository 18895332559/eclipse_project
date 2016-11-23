use fs09 ;

create table account(account_id varchar(10),
					account_name varchar(20),
					account_psd varchar(20),
					is_admin varchar(1)
)
insert into account values(1,'admin','admin','1') ;--插入管理员
