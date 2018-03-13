/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cities 
{
Map<String,List<String>> provinces = new HashMap();
public Cities()
{
    List<String> list = new ArrayList();
    list.add("Elblag");
    provinces.put("Warminsko-Mazurskie",list);
    List<String> list2 = Arrays.asList("Gdansk","Sopot","Gdynia");
    provinces.put("Pomorskie",list2);
 
}
public Collection<String> provinces()
{
   return provinces.keySet();
}
public List<String> cities(String province)
{
 return provinces.get(province);
}
public Map<String,String> provinceWithOneCity()
{
    return null;
}
public Collection<String> cities()
{
    return null;
}
}

