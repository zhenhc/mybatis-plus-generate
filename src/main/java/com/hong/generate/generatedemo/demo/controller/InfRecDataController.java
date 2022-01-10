package com.hong.generate.generatedemo.demo.controller;



import com.hong.generate.generatedemo.demo.service.InfRecDataService;
import com.hong.generate.generatedemo.demo.entity.InfRecData;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hong.generate.common.PageResult;
import com.hong.generate.common.Result;
import com.hong.generate.common.StatusCode;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
    import org.springframework.web.bind.annotation.RestController;

/**
* <p>
    * Resuful 接口数据 前端控制器
    * </p>
*
* @author liyh
* @since 2020-12-22
*/

@Slf4j
@Api(tags = "Resuful 接口数据")
@RestController
@RequestMapping("/demo/infRecData")
public class InfRecDataController {

    @Autowired
    public InfRecDataService infRecDataService;

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody InfRecData infRecData){
        infRecDataService.save(infRecData);
        return new Result(StatusCode.SUCCESS,"保存成功");
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Long id){
        infRecDataService.removeById(id);
        return new Result(StatusCode.SUCCESS,"删除成功");
    }

    @ApiOperation(value = "条件查询")
    @PostMapping("/get")
    public Result list(@RequestBody InfRecData infRecData){
        List<InfRecData> infRecDataList = infRecDataService.list(new QueryWrapper<>(infRecData));
        return new Result(StatusCode.SUCCESS,"查询成功",infRecDataList);
    }

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/list/{pageNum}/{pageSize}")
    public Object list(@PathVariable("pageNum")Long pageNum, @PathVariable("pageSize")Long pageSize){
        IPage<InfRecData> page = infRecDataService.page(
        new Page<>(pageNum, pageSize), null);
        return new Result(StatusCode.SUCCESS,"查询成功",new PageResult<>(page.getTotal(),page.getRecords()));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/get/{id}")
    public Result get(@PathVariable("id") String id){
        InfRecData infRecData = infRecDataService.getById(id);
        return new Result(StatusCode.SUCCESS,"查询成功",infRecData);
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/update/{id}")
    public Result update(@PathVariable("id") String id, @RequestBody InfRecData infRecData){
        infRecData.setId(id);
        infRecDataService.updateById(infRecData);
        return new Result(StatusCode.SUCCESS,"更新成功");
    }


}
