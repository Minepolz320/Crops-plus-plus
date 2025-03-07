package com.github.bartimaeusnek.cropspp.GTHandler;

import static com.github.bartimaeusnek.cropspp.items.CppItems.itemLens;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.bartimaeusnek.cropspp.items.CppItems;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import ic2.core.Ic2Items;

public class GTCraftingRecipeLoader implements Runnable {

    private static final String aTextWire1 = "wire.";
    private static final String aTextCable1 = "cable.";
    private static final String aTextWire2 = " Wire";
    private static final String aTextCable2 = " Cable";
    private static final String aTextPlate = "PPP";
    private static final String aTextPlateWrench = "PwP";
    private static final String aTextPlateMotor = "PMP";
    private static final String aTextCableHull = "CMC";
    private static final String aTextWireHull = "WMW";
    private static final String aTextWireChest = "WTW";
    private static final String aTextWireCoil = "WCW";
    private static final String aTextMotorWire = "EWE";
    private static final String aTextWirePump = "WPW";

    private static final long bitsd = GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE
            | GT_ModHandler.RecipeBits.REVERSIBLE;

    public GTCraftingRecipeLoader() {
        super();
    }

    public void run() {
        CropItemList.weedingTrowel.set(Ic2Items.weedingTrowel);
        CropItemList.Spade.set(CppItems.itemSpadeStack);
        GT_ModHandler.addCraftingRecipe(
                CppItems.itemSpadeStack,
                bitsd,
                new Object[] { "fPh", "PWP", " S ", 'P', OrePrefixes.plateDense.get(Materials.Steel), 'W',
                        CropItemList.weedingTrowel, 'S', OrePrefixes.stickLong.get(Materials.Wood) });

        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorLV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_LV, 'T', ItemList.Emitter_LV, 'R',
                        ItemList.Sensor_LV, 'C', OrePrefixes.circuit.get(Materials.Good), 'W',
                        OrePrefixes.cableGt01.get(Materials.Tin) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorMV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_MV, 'T', ItemList.Emitter_MV, 'R',
                        ItemList.Sensor_MV, 'C', OrePrefixes.circuit.get(Materials.Advanced), 'W',
                        OrePrefixes.cableGt01.get(Materials.AnyCopper) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorHV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_HV, 'T', ItemList.Emitter_HV, 'R',
                        ItemList.Sensor_HV, 'C', OrePrefixes.circuit.get(Materials.Data), 'W',
                        OrePrefixes.cableGt01.get(Materials.Gold) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorEV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_EV, 'T', ItemList.Emitter_EV, 'R',
                        ItemList.Sensor_EV, 'C', OrePrefixes.circuit.get(Materials.Elite), 'W',
                        OrePrefixes.cableGt01.get(Materials.Aluminium) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorIV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_IV, 'T', ItemList.Emitter_IV, 'R',
                        ItemList.Sensor_IV, 'C', OrePrefixes.circuit.get(Materials.Master), 'W',
                        OrePrefixes.cableGt01.get(Materials.Tungsten) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorLuV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_LuV, 'T', ItemList.Emitter_LuV, 'R',
                        ItemList.Sensor_LuV, 'C', OrePrefixes.circuit.get(Materials.Ultimate), 'W',
                        OrePrefixes.cableGt01.get(Materials.VanadiumGallium) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorZPM.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_ZPM, 'T', ItemList.Emitter_ZPM, 'R',
                        ItemList.Sensor_ZPM, 'C', OrePrefixes.circuit.get(Materials.SuperconductorUHV), 'W',
                        OrePrefixes.cableGt01.get(Materials.Naquadah) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorUV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_UV, 'T', ItemList.Emitter_UV, 'R',
                        ItemList.Sensor_UV, 'C', OrePrefixes.circuit.get(Materials.Infinite), 'W',
                        OrePrefixes.cableGt01.get(Materials.NaquadahAlloy) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropGeneExtractorUHV.get(1L),
                bitsd,
                new Object[] { "RTR", aTextWireHull, "CRC", 'M', ItemList.Hull_MAX, 'T', ItemList.Emitter_UHV, 'R',
                        ItemList.Sensor_UHV, 'C', OrePrefixes.circuit.get(Materials.Bio), 'W',
                        OrePrefixes.wireGt01.get(Materials.SuperconductorUV) });

        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorLV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_LV, 'F',
                        ItemList.Field_Generator_LV, 'E', ItemList.Emitter_LV, 'C',
                        OrePrefixes.circuit.get(Materials.Good), 'W', OrePrefixes.cableGt04.get(Materials.Tin) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorMV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_MV, 'F',
                        ItemList.Field_Generator_MV, 'E', ItemList.Emitter_MV, 'C',
                        OrePrefixes.circuit.get(Materials.Advanced), 'W',
                        OrePrefixes.cableGt04.get(Materials.AnyCopper) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorHV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_HV, 'F',
                        ItemList.Field_Generator_HV, 'E', ItemList.Emitter_HV, 'C',
                        OrePrefixes.circuit.get(Materials.Data), 'W', OrePrefixes.cableGt04.get(Materials.Gold) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorEV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_EV, 'F',
                        ItemList.Field_Generator_EV, 'E', ItemList.Emitter_EV, 'C',
                        OrePrefixes.circuit.get(Materials.Elite), 'W',
                        OrePrefixes.cableGt04.get(Materials.Aluminium) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorIV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_IV, 'F',
                        ItemList.Field_Generator_IV, 'E', ItemList.Emitter_IV, 'C',
                        OrePrefixes.circuit.get(Materials.Master), 'W',
                        OrePrefixes.cableGt04.get(Materials.Tungsten) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorLuV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_LuV, 'F',
                        ItemList.Field_Generator_LuV, 'E', ItemList.Emitter_LuV, 'C',
                        OrePrefixes.circuit.get(Materials.Ultimate), 'W',
                        OrePrefixes.cableGt04.get(Materials.VanadiumGallium) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorZPM.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_ZPM, 'F',
                        ItemList.Field_Generator_ZPM, 'E', ItemList.Emitter_ZPM, 'C',
                        OrePrefixes.circuit.get(Materials.SuperconductorUHV), 'W',
                        OrePrefixes.cableGt04.get(Materials.Naquadah) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorUV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_UV, 'F',
                        ItemList.Field_Generator_UV, 'E', ItemList.Emitter_UV, 'C',
                        OrePrefixes.circuit.get(Materials.Infinite), 'W',
                        OrePrefixes.cableGt04.get(Materials.NaquadahAlloy) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropReplicatorUHV.get(1L),
                bitsd,
                new Object[] { "CFC", aTextCableHull, aTextMotorWire, 'M', ItemList.Hull_MAX, 'F',
                        ItemList.Field_Generator_UHV, 'E', ItemList.Emitter_UHV, 'C',
                        OrePrefixes.circuit.get(Materials.Bio), 'W',
                        OrePrefixes.wireGt04.get(Materials.SuperconductorUV) });

        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserLV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_LV, 'F', ItemList.Field_Generator_LV,
                        'E', ItemList.Emitter_LV, 'C', OrePrefixes.circuit.get(Materials.Good), 'W',
                        OrePrefixes.cableGt04.get(Materials.Tin) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserMV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_MV, 'F', ItemList.Field_Generator_MV,
                        'E', ItemList.Emitter_MV, 'C', OrePrefixes.circuit.get(Materials.Advanced), 'W',
                        OrePrefixes.cableGt04.get(Materials.AnyCopper) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserHV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_HV, 'F', ItemList.Field_Generator_HV,
                        'E', ItemList.Emitter_HV, 'C', OrePrefixes.circuit.get(Materials.Data), 'W',
                        OrePrefixes.cableGt04.get(Materials.Gold) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserEV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_EV, 'F', ItemList.Field_Generator_EV,
                        'E', ItemList.Emitter_EV, 'C', OrePrefixes.circuit.get(Materials.Elite), 'W',
                        OrePrefixes.cableGt04.get(Materials.Aluminium) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserIV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_IV, 'F', ItemList.Field_Generator_IV,
                        'E', ItemList.Emitter_IV, 'C', OrePrefixes.circuit.get(Materials.Master), 'W',
                        OrePrefixes.cableGt04.get(Materials.Tungsten) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserLuV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_LuV, 'F', ItemList.Field_Generator_LuV,
                        'E', ItemList.Emitter_LuV, 'C', OrePrefixes.circuit.get(Materials.Ultimate), 'W',
                        OrePrefixes.cableGt04.get(Materials.VanadiumGallium) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserZPM.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_ZPM, 'F', ItemList.Field_Generator_ZPM,
                        'E', ItemList.Emitter_ZPM, 'C', OrePrefixes.circuit.get(Materials.SuperconductorUHV), 'W',
                        OrePrefixes.cableGt04.get(Materials.Naquadah) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserUV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_UV, 'F', ItemList.Field_Generator_UV,
                        'E', ItemList.Emitter_UV, 'C', OrePrefixes.circuit.get(Materials.Infinite), 'W',
                        OrePrefixes.cableGt04.get(Materials.NaquadahAlloy) });
        GT_ModHandler.addCraftingRecipe(
                CropItemList.cropSynthesiserUHV.get(1L),
                bitsd,
                new Object[] { "FCF", aTextCableHull, "EEE", 'M', ItemList.Hull_MAX, 'F', ItemList.Field_Generator_UHV,
                        'E', ItemList.Emitter_UHV, 'C', OrePrefixes.circuit.get(Materials.Bio), 'W',
                        OrePrefixes.wireGt04.get(Materials.SuperconductorUV) });

        GT_ModHandler.addCraftingRecipe(
                new ItemStack(itemLens),
                GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.MIRRORED
                        | GT_ModHandler.RecipeBits.DISMANTLEABLE
                        | GT_ModHandler.RecipeBits.REVERSIBLE,
                new Object[] { " fL", " Sr", "S  ", 'L',
                        GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Glass, 1L), 'S',
                        new ItemStack(Items.stick) });
        GT_ModHandler.addCraftingRecipe(
                GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Glass, 1L),
                GT_ModHandler.RecipeBits.NOT_REMOVABLE,
                new Object[] { "FfF", "FGF", "FDF", 'F', new ItemStack(Items.flint), 'G', new ItemStack(Blocks.glass),
                        'D', new ItemStack(Items.diamond) });
    }
}
