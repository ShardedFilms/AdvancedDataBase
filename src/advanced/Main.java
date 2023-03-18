package advanced;

import arc.*;
import arc.util.Time;
import mindustry.game.EventType.*;
import mindustry.mod.*;

//hidden mods cant loadContent()
public class Main extends Mod {

    public static BulletDisplayContent bullet;

    public Main() {
        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10, () -> {
                Intelligence.initStats();// some icons are not loaded when event occurs
            });
            new DataBaseContent();
            new SpriteContent();
            new AtlasContent();
            new IconsContent();
            bullet = new BulletDisplayContent();
            Funny.init();
            SettingsMenu.init();
        });
    }
}