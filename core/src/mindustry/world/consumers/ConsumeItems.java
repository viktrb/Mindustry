package mindustry.world.consumers;

import arc.scene.ui.layout.*;
import arc.struct.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.meta.*;

public class ConsumeItems extends Consume{
    public final ItemStack[] items;

    public ConsumeItems(ItemStack[] items){
        this.items = items;
    }

    /** Mods.*/
    protected ConsumeItems(){
        this(ItemStack.empty);
    }

    @Override
    public void applyItemFilter(Bits filter){
        for(var stack : items){
            filter.set(stack.item.id);
        }
    }

    @Override
    public ConsumeType type(){
        return ConsumeType.item;
    }

    @Override
    public void build(Building build, Table table){
        table.table(c -> {
            int i = 0;
            for(var stack : items){
                c.add(new ReqImage(new ItemImage(stack.item.uiIcon, stack.amount),
                () -> build.items != null && build.items.has(stack.item, stack.amount))).padRight(8);
                if(++i % 4 == 0) c.row();
            }
        }).left();
    }

    @Override
    public void trigger(Building build){
        for(var stack : items){
            build.items.remove(stack);
        }
    }

    @Override
    public boolean valid(Building build){
        return build.consumeTriggerValid() || build.items.has(items);
    }

    @Override
    public void display(Stats stats){
        stats.add(booster ? Stat.booster : Stat.input, stats.timePeriod < 0 ? StatValues.items(items) : StatValues.items(stats.timePeriod, items));
    }
}
