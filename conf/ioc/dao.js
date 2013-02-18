var ioc = {
	dataSource : {
		type :"com.alibaba.druid.pool.DruidDataSource",
		events : {
			depose :"close"
		},
		fields : {
			driverClassName : 'com.mysql.jdbc.Driver',
			url             : 'jdbc:mysql://218.94.158.227:33041/gaoseng?useUnicode=true&characterEncoding=UTF-8',
			username        : 'howe',
			password        : '19860322',
			initialSize     : 10,
			maxActive       : 100,
			minIdle         : 10,
			maxIdle         : 20,
			defaultAutoCommit: false,
			
			//validationQueryTimeout : 5,
			validationQuery : "select 1"
		}
	},
    dao : {
        type : "org.nutz.dao.impl.NutDao",
        fields : {
        	dataSource : {refer : 'dataSource'}
        }
    }
};