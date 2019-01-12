package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Project Name: Qinwell
 * <br>
 * Description:
 * <br>
 * File Name: GetImportance
 * <br>
 * Copyright: Copyright (C) 2015 All Rights Reserved.
 * <br>
 * Company: 杭州勤淮科技有限公司
 * <br>
 *
 * @author StackTc
 * @create time：2019-01-08 23:52
 * @version: v1.0
 */
public class GetImportance {

    public static void main(String[] args) {

    }

    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees)
            map.put(e.id, e);
        return getImportanceHelper(map, id);
    }

    /**
     * 递归，这里 好好做一下(重点)
     * @param map
     * @param id
     * @return
     */
    public int getImportanceHelper(HashMap<Integer, Employee> map, int id)
    {

        if (map.get(id).subordinates.size() == 0) {
            return map.get(id).importance;
        }

        int result = map.get(id).importance;
        for (int i : map.get(id).subordinates) {
            result += getImportanceHelper(map, i);
        }
        return result;
    }
}