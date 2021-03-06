package net.snowyhollows.bento.gdx.system;

import net.snowyhollows.bento.gdx.factory.OrthographicCameraFactory;
import net.snowyhollows.bento.gdx.factory.SpriteBatchFactory;
import net.snowyhollows.bento2.Bento;
import net.snowyhollows.bento2.BentoFactory;

public enum DisplayFactory implements BentoFactory<Display> {
    IT;
    @Override
    public Display createInContext(Bento bento) {
        return new Display(bento.get(SpriteBatchFactory.IT), bento.get(OrthographicCameraFactory.IT));
    }
}
