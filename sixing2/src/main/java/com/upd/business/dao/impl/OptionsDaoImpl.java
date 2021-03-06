package com.upd.business.dao.impl;

import com.upd.business.dao.OptionsDao;
import com.upd.business.entity.Options;
import com.upd.common.basis.dao.impl.BaseDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by ljw on 2017/5/4.
 */
@Repository("optionsDao")
public class OptionsDaoImpl extends BaseDaoImpl<Options,Integer> implements OptionsDao {
}
