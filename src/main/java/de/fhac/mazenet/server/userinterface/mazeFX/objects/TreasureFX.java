package de.fhac.mazenet.server.userinterface.mazeFX.objects;

import de.fhac.mazenet.server.generated.Treasure;
import de.fhac.mazenet.server.userinterface.mazeFX.util.ImageResourcesFX;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;

/**
 * Created by Richard on 01.06.2016.
 */
public class TreasureFX extends Cylinder {

	private static final double RADIUS = 0.2;
	private static final double HEIGHT = 0.025;

    private Treasure treasure;
    private Image image;
	private PhongMaterial material;

	private TreasureFX() {
		super(RADIUS, HEIGHT);
		material = new PhongMaterial(Color.WHITE);
		setMaterial(material);
		setCullFace(CullFace.NONE);
	}

    public TreasureFX(Treasure tt) {
        this();
		image = ImageResourcesFX.getImage(tt.value());
		material.setDiffuseMap(image);
        treasure = tt;
    }

    public Treasure getTreasure() {
        return treasure;
    }

	public void treasureFound() {
        ImageResourcesFX.treasureFound(treasure.value());
        material.setDiffuseMap(ImageResourcesFX.getImage(treasure.value()));
    }
}
