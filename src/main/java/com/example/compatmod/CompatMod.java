package com.example.compatmod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mod "guarda-chuva" de compatibilidade.
 *
 * A ideia é que este mod NÃO redistribui nem modifica os jars originais dos
 * mods que vocês estão consertando — ele apenas roda ao lado deles e
 * intercepta comportamento via eventos do NeoForge e/ou Mixins (ver pacote
 * `mixin`). Isso evita qualquer problema de licença, já que vocês não estão
 * copiando código de terceiros, só reagindo a ele em tempo de execução.
 */
@Mod(CompatMod.MODID)
public class CompatMod {

    public static final String MODID = "examplecompatmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public CompatMod(IEventBus modEventBus) {
        LOGGER.info("Mod de compatibilidade carregado — pronto pra consertar as brigas entre mods.");

        // Registrem aqui listeners de eventos do NeoForge quando o conserto
        // não exigir mexer em bytecode de outro mod (ex.: ajustar registries,
        // cancelar eventos conflitantes, reagir a RegisterEvent, etc.)
        NeoForge.EVENT_BUS.register(this);
    }
}
