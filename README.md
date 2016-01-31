# Dber

Dber is an easy dao layer,based on Spring's JdbcTemplate.

### Usage

add spring config, provide a Dber bean with JdbcTemplate:

``` java
 @Bean(initMethod = "initByPackageScan")
    public Dber dber(JdbcTemplate jdbcTemplate){
        Dber dber = new Dber();
        dber.setDaoPackageToScan(Collections.singletonList("psyco"));
        dber.setSqlDelegate(new SqlDelegateImpl(jdbcTemplate));
        return dber;
    }
```

annotate your dao:

``` java
@Dao
public interface DaoLayer {
    @Select("select * from User where id < ?")
    List<User> find(long id);

    @Select("select * from User where name = #name ")
    List<User> findByName(@Param("name") String name);
}
```

then you can use it in spring like what you usually do :

``` java
	@Resource
    DaoLayer daoLayer;
    
    @Test
    public void find() {
        print(daoLayer.find(22));
    }
```

simple as that.