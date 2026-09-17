package com.example.compatmod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * EXEMPLO — substituam "SomeClassFromOtherMod" pela classe real do mod que
 * vocês querem "consertar" (localizem o nome completo com um decompilador,
 * ex.: abrindo o jar do mod no IntelliJ/Vineflower, ou olhando o crash log).
 *
 * Este mixin não copia nem redistribui código do mod-alvo: ele só injeta
 * uma chamada extra num método já existente, em tempo de execução, na
 * máquina do próprio usuário que já tem os dois mods instalados legalmente.
 */
// @Mixin(targets = "com.outromod.package.SomeClassFromOtherMod")
public class ExampleTargetMixin {

    // Exemplo: rodar algo logo depois que um método do outro mod terminar
    // @Inject(method = "someMethodName", at = @At("TAIL"))
    // private void examplecompatmod$afterSomeMethod(CallbackInfo ci) {
    //     // lógica de correção aqui
    // }
}
