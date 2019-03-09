package net.snowyhollows.bento.gdx.util;

import net.snowyhollows.bento.gdx.factory.FitViewportFactory;
import net.snowyhollows.bento.gdx.factory.OrthographicCameraFactory;
import net.snowyhollows.bento2.Bento;
import net.snowyhollows.bento2.BentoFactory;

public enum FitViewportUnprojectorFactory implements BentoFactory<Unprojector> {
    IT;
    @Override
    public Unprojector createInContext(Bento bento) {
        return new Unprojector(null, bento.get(FitViewportFactory.IT));
    }
}