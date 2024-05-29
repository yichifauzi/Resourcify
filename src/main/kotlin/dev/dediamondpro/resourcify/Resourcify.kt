/*
 * This file is part of Resourcify
 * Copyright (C) 2023 DeDiamondPro
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License Version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

//#if FORGELIKE == 1

package dev.dediamondpro.resourcify

//#if MODERN == 0
import net.minecraftforge.fml.common.Mod
//#elseif FORGE == 1
//$$ import dev.dediamondpro.resourcify.platform.EventHandler
//$$ import net.minecraft.client.Minecraft
//$$ import net.minecraftforge.fml.ModLoadingContext
//$$ import dev.dediamondpro.resourcify.config.SettingsPage
//$$ //#if MC < 11800
//$$ import net.minecraftforge.fml.ExtensionPoint
//$$ import net.minecraft.client.gui.screen.Screen
//$$ import java.util.function.BiFunction
//$$ //#elseif MC < 11900
//$$ //$$ import net.minecraft.client.gui.screens.Screen
//$$ //$$ import net.minecraftforge.client.ConfigGuiHandler.ConfigGuiFactory
//$$ //#else
//$$ //$$ import net.minecraft.client.gui.screens.Screen
//$$ //$$ import net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory;
//$$ //#endif
//#endif

//#if NEOFORGE == 1 && MODERN == 1
//$$ import thedarkcolour.kotlinforforge.neoforge.forge.FORGE_BUS
//$$ import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
//$$ import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
//$$ import net.neoforged.fml.common.Mod
//$$ import net.minecraft.client.gui.screens.Screen
//$$ import dev.dediamondpro.resourcify.platform.EventHandler
//$$ import net.minecraft.client.Minecraft
//$$ import net.neoforged.fml.ModLoadingContext
//$$ import dev.dediamondpro.resourcify.config.SettingsPage
//#elseif FORGE == 1 && MODERN == 1
//$$ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
//$$ import net.minecraftforge.fml.common.Mod
//$$ import thedarkcolour.kotlinforforge.forge.FORGE_BUS
//$$ import thedarkcolour.kotlinforforge.forge.MOD_BUS
//#endif

//#if MC >= 12006 && NEOFORGE == 1
//$$ import net.neoforged.neoforge.client.gui.IConfigScreenFactory
//#elseif NEOFORGE == 1
//$$ import net.neoforged.neoforge.client.ConfigScreenHandler.ConfigScreenFactory
//#endif

//#if MODERN == 0
@Mod(
    name = ModInfo.NAME,
    modid = ModInfo.ID,
    version = ModInfo.VERSION,
    guiFactory = "dev.dediamondpro.resourcify.config.ForgeGuiFactory",
    modLanguageAdapter = "dev.dediamondpro.resourcify.platform.KotlinLanguageAdapter"
)
//#else
//$$ @Mod(ModInfo.ID)
//#endif
object Resourcify {
    //#if MC > 11202
    //$$ init {
    //$$     MOD_BUS.addListener(this::onClientInit)
    //$$     //#if MC < 11800
    //$$     ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY) {
    //$$        BiFunction { _: Minecraft?, _: Screen? -> SettingsPage() }
    //$$     }
    //$$     //#elseif MC < 11900
    //$$     //$$ ModLoadingContext.get().registerExtensionPoint(ConfigGuiFactory::class.java) {
    //$$     //$$     ConfigGuiFactory { _: Minecraft?, _: Screen? -> SettingsPage() }
    //$$     //$$ }
    //$$     //#elseif MC < 12006
    //$$     //$$ ModLoadingContext.get().registerExtensionPoint(ConfigScreenFactory::class.java) {
    //$$     //$$     ConfigScreenFactory { _: Minecraft?, _: Screen? -> SettingsPage() }
    //$$     //$$ }
    //$$     //#else
    //$$     //$$ ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory::class.java) {
    //$$     //$$     IConfigScreenFactory { _: Minecraft?, _: Screen? -> SettingsPage() }
    //$$     //$$ }
    //$$     //#endif
    //$$ }
    //$$
    //$$ private fun onClientInit(event: FMLClientSetupEvent) {
    //$$     FORGE_BUS.register(EventHandler)
    //$$ }
    //#endif
}

//#endif