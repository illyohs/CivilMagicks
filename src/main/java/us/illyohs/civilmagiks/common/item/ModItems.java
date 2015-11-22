/**
 * Copyright (c) 2014, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagiks.common.item;

import us.illyohs.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagiks.common.item.armor.ArmorMonocle;
import us.illyohs.civilmagiks.common.item.mana.ItemManaShard;
import us.illyohs.civilmagiks.common.item.writ.ItemWrit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import net.minecraftforge.fml.common.registry.GameRegistry;
import us.illyohs.libilly.item.ItemBase;

public class ModItems {

    public static Item itemManaShard;
    
    public static Item itemWand;
    
    public static Item itemWrit;

    public static Item itemManaCatalyst;

    public static ItemBase pen;
    
    
    //Armor
    public static ItemArmor armorMonocle;

    public static void init() {

        itemManaShard = new ItemManaShard();
        itemWrit = new ItemWrit();
        
        itemManaCatalyst = new ItemManaCatalyst();

        pen = new ItemPen("civilmagicks:pen", false, CivilTab.BLOCKS);
        
        //Armor
        armorMonocle = new ArmorMonocle();
        
        gameReg();

        
    }

    private static void gameReg() {
        GameRegistry.registerItem(itemManaShard, "manashard");
        GameRegistry.registerItem(itemWrit, "writ");
        GameRegistry.registerItem(pen, "fountainpen");

    }	
}
