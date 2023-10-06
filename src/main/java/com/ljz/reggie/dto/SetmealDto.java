package com.ljz.reggie.dto;

import com.ljz.reggie.entity.Setmeal;
import com.ljz.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
