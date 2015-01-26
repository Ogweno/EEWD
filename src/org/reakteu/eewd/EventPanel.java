/*
 * Copyright (C) 2014 by gempa GmbH - http://gempa.de
 * License: http://www.gnu.org/licenses/gpl.html GPL version 2 or higher
 */
package org.reakteu.eewd;

import org.reakteu.eewd.data.EventData;
import org.reakteu.eewd.data.EventTimeListener;
import org.reakteu.eewd.utils.GeoCalc;
import org.reakteu.eewd.data.POI;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import javax.swing.Box.Filler;
import javax.swing.ComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import org.reakteu.eewd.data.Shaking;
import org.reakteu.eewd.utils.RomanNumber;

/**
 *
 * @author Stephan Herrnkind <herrnkind@gempa.de>
 */
public class EventPanel extends javax.swing.JPanel implements EventTimeListener {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JLabel eventCaptionLabel = new javax.swing.JLabel();
        eventLabel = new javax.swing.JLabel();
        javax.swing.JLabel timeCaptionLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        javax.swing.JLabel magnitudeCaptionLabel = new javax.swing.JLabel();
        magnitudeLabel = new javax.swing.JLabel();
        javax.swing.JLabel lacationCaptionLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        targetCaptionLabel = new javax.swing.JLabel();
        targetCombo = new javax.swing.JComboBox();
        javax.swing.JLabel distanceCaptionLabel = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        pgaCaptionLabel = new javax.swing.JLabel();
        pgaLabel = new javax.swing.JLabel();
        pgvCaptionLabel = new javax.swing.JLabel();
        pgvLabel = new javax.swing.JLabel();
        drsCaptionLabel = new javax.swing.JLabel();
        drsLabel = new javax.swing.JLabel();
        intensityCaptionLabel = new javax.swing.JLabel();
        intensityLabel = new javax.swing.JLabel();
        javax.swing.JLabel likelihoodCaptionLabel = new javax.swing.JLabel();
        likelihoodLabel = new javax.swing.JLabel();
        psaCaptionLabel = new javax.swing.JLabel();
        psaLabel = new javax.swing.JLabel();
        intensityPercentLabel = new javax.swing.JLabel();
        drsPercentLabel = new javax.swing.JLabel();
        psaPercentLabel = new javax.swing.JLabel();
        pgvPercentLabel = new javax.swing.JLabel();
        pgaPercentLabel = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        javax.swing.JLabel timeRemainingCaptionLabel = new javax.swing.JLabel();
        timeRemainingLabel = new javax.swing.JLabel();

        setEnabled(false);
        setLayout(new java.awt.GridBagLayout());

        eventCaptionLabel.setLabelFor(eventLabel);
        eventCaptionLabel.setText("Event");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(eventCaptionLabel, gridBagConstraints);

        eventLabel.setText("gfz2014abcd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(eventLabel, gridBagConstraints);

        timeCaptionLabel.setLabelFor(timeLabel);
        timeCaptionLabel.setText("Time");
        timeCaptionLabel.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(timeCaptionLabel, gridBagConstraints);

        timeLabel.setText("2014-11-01 01:02:45.123 (7.8s ago)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(timeLabel, gridBagConstraints);

        magnitudeCaptionLabel.setLabelFor(magnitudeLabel);
        magnitudeCaptionLabel.setText("Magnitude");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 2, 7);
        add(magnitudeCaptionLabel, gridBagConstraints);

        magnitudeLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        magnitudeLabel.setText("3.4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 7, 2, 7);
        add(magnitudeLabel, gridBagConstraints);

        lacationCaptionLabel.setLabelFor(locationLabel);
        lacationCaptionLabel.setText("Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(lacationCaptionLabel, gridBagConstraints);

        locationLabel.setText("52.123N 11.678E");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(locationLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 7, 7, 7);
        add(separator, gridBagConstraints);

        targetCaptionLabel.setLabelFor(targetCombo);
        targetCaptionLabel.setText("Target");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 7, 4, 7);
        add(targetCaptionLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 7, 4, 7);
        add(targetCombo, gridBagConstraints);

        distanceCaptionLabel.setLabelFor(distanceLabel);
        distanceCaptionLabel.setText("Distance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(distanceCaptionLabel, gridBagConstraints);

        distanceLabel.setText("99km");
        distanceLabel.setToolTipText("estimated arrival of S wave");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(distanceLabel, gridBagConstraints);

        pgaCaptionLabel.setLabelFor(pgaLabel);
        pgaCaptionLabel.setText("PGA (g)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(pgaCaptionLabel, gridBagConstraints);

        pgaLabel.setText("2.3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(pgaLabel, gridBagConstraints);

        pgvCaptionLabel.setLabelFor(pgvLabel);
        pgvCaptionLabel.setText("PGV (cm/s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(pgvCaptionLabel, gridBagConstraints);

        pgvLabel.setText("3m/s");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(pgvLabel, gridBagConstraints);

        drsCaptionLabel.setLabelFor(drsLabel);
        drsCaptionLabel.setText("DRS (cm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(drsCaptionLabel, gridBagConstraints);

        drsLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(drsLabel, gridBagConstraints);

        intensityCaptionLabel.setLabelFor(intensityLabel);
        intensityCaptionLabel.setText("Intensity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(intensityCaptionLabel, gridBagConstraints);

        intensityLabel.setText("IX");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(intensityLabel, gridBagConstraints);

        likelihoodCaptionLabel.setLabelFor(likelihoodLabel);
        likelihoodCaptionLabel.setText("Likelihood of correct alarm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(likelihoodCaptionLabel, gridBagConstraints);

        likelihoodLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        likelihoodLabel.setText("79%");
        likelihoodLabel.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(likelihoodLabel, gridBagConstraints);

        psaCaptionLabel.setLabelFor(drsLabel);
        psaCaptionLabel.setText("PSA (g");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(psaCaptionLabel, gridBagConstraints);

        psaLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(psaLabel, gridBagConstraints);

        intensityPercentLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(intensityPercentLabel, gridBagConstraints);

        drsPercentLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(drsPercentLabel, gridBagConstraints);

        psaPercentLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(psaPercentLabel, gridBagConstraints);

        pgvPercentLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(pgvPercentLabel, gridBagConstraints);

        pgaPercentLabel.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(pgaPercentLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 7, 4, 7);
        add(separator1, gridBagConstraints);

        timeRemainingCaptionLabel.setLabelFor(distanceLabel);
        timeRemainingCaptionLabel.setText("Remaining Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(timeRemainingCaptionLabel, gridBagConstraints);

        timeRemainingLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        timeRemainingLabel.setText("10");
        timeRemainingLabel.setToolTipText("estimated arrival of S wave");
        timeRemainingLabel.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 2, 7);
        add(timeRemainingLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JLabel drsCaptionLabel;
    private javax.swing.JLabel drsLabel;
    private javax.swing.JLabel drsPercentLabel;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JLabel intensityCaptionLabel;
    private javax.swing.JLabel intensityLabel;
    private javax.swing.JLabel intensityPercentLabel;
    private javax.swing.JLabel likelihoodLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel magnitudeLabel;
    private javax.swing.JLabel pgaCaptionLabel;
    private javax.swing.JLabel pgaLabel;
    private javax.swing.JLabel pgaPercentLabel;
    private javax.swing.JLabel pgvCaptionLabel;
    private javax.swing.JLabel pgvLabel;
    private javax.swing.JLabel pgvPercentLabel;
    private javax.swing.JLabel psaCaptionLabel;
    private javax.swing.JLabel psaLabel;
    private javax.swing.JLabel psaPercentLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JLabel targetCaptionLabel;
    private javax.swing.JComboBox targetCombo;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timeRemainingLabel;
    // End of variables declaration//GEN-END:variables

    private final double vs;
    private final DateFormat df;

    private EventData event;
    private Long originTimeOffset;
    private boolean eventChanged;
    private boolean timeChanged;

    private SpectrumPlot graph = null;
    private ComboBoxModel targetComboModel = null;

    /**
     * Creates new form EventPanel1
     *
     * @param targets
     */
    public EventPanel(List<POI> targets) {
        Application app = Application.getInstance();

        vs = app.getProperty(Application.PropertyVS, Application.DefaultVS);
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));

        event = null;
        originTimeOffset = null;
        eventChanged = true;
        timeChanged = true;

        if (app.getPeriods().length > 0) {
            graph = new SpectrumPlot(app.getPeriods());
        }

        initComponents();

        String controlText = ")";
        if (app.getControlPeriod() != null) {
            if (app.isUseFrequencies()) {
                controlText = String.format(", @%.1fHz)", 1 / app.getControlPeriod());
            } else {
                controlText = String.format(", @%ss)", app.getControlPeriod());
            }
        }
        psaCaptionLabel.setText(psaCaptionLabel.getText() + controlText);
        drsCaptionLabel.setText(drsCaptionLabel.getText() + controlText);

        targetCombo.setEnabled(!targets.isEmpty());
        if (!targets.isEmpty()) {
            targetComboModel = new javax.swing.DefaultComboBoxModel(targets.toArray());
            targetCombo.setModel(targetComboModel);
            targetCombo.addMouseWheelListener(new MouseWheelListener() {
                @Override
                public void mouseWheelMoved(MouseWheelEvent e) {
                    if (e.getWheelRotation() < 0) {
                        int i = targetCombo.getSelectedIndex() - 1;
                        if (i >= 0) {
                            targetCombo.setSelectedIndex(i);
                        }
                    } else {
                        int i = targetCombo.getSelectedIndex() + 1;
                        if (i < targetComboModel.getSize()) {
                            targetCombo.setSelectedIndex(i);
                        }
                    }
                }
            });
            targetCombo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    update();
                }
            });
        }

        update();

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 16;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = java.awt.GridBagConstraints.BOTH;
        c.anchor = java.awt.GridBagConstraints.WEST;
        c.weighty = 1.0;
        c.insets = new java.awt.Insets(7, 7, 7, 7);

        if (graph == null) {
            add(new Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767)), c);
        } else {
            add(graph, c);
        }
    }

    @Override
    synchronized public void processEventTime(EventData event, Long originTimeOffset) {
        eventChanged = event != this.event;
        timeChanged = this.originTimeOffset == null || !this.originTimeOffset.equals(originTimeOffset);
        this.event = event;
        this.originTimeOffset = originTimeOffset;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                update();
            }
        });
    }

    synchronized private void update() {
        if (eventChanged) {
            boolean enabled = event != null;
            for (Component c : getComponents()) {
                if (c == targetCombo || c == targetCaptionLabel) {
                    continue;
                }
                c.setEnabled(enabled);
            }

            // update event information
            if (event == null) {
                eventLabel.setText("-");
                timeLabel.setText("-");
                magnitudeLabel.setText("-");
                locationLabel.setText("-");
                likelihoodLabel.setText("-");
            } else {
                eventLabel.setText(event.eventID);
                magnitudeLabel.setText(String.format("%.1f", event.magnitude));
                locationLabel.setText(String.format("%.2f%s %.2f%s, %.1fkm",
                                                    Math.abs(event.latitude),
                                                    event.latitude < 0 ? "S" : "N",
                                                    Math.abs(event.longitude),
                                                    event.longitude < 0 ? "W" : "E",
                                                    event.depth / 1000.0));
                if (event.likelihood != null) {
                    likelihoodLabel.setText(String.format("%d%%", (int) (event.likelihood * 100)));
                }
            }
        }

        // update origin time offset information
        if (timeChanged && event != null) {
            if (originTimeOffset == null) {
                timeLabel.setText(df.format(event.time));
            } else {
                timeLabel.setText(String.format("%s (%ds ago)",
                                                df.format(event.time),
                                                (int) (originTimeOffset / 1000.0)));
            }
        }

        // update target information
        POI target = (POI) targetCombo.getSelectedItem();
        if (graph != null) {
            graph.setTarget(target);
        }
        if (target == null) {
            timeRemainingLabel.setText("-");
            distanceLabel.setText("-");
            pgaLabel.setText("-");
            pgaPercentLabel.setText("");
            pgvLabel.setText("-");
            pgvPercentLabel.setText("");
            psaLabel.setText("-");
            psaPercentLabel.setText("");
            drsLabel.setText("-");
            drsPercentLabel.setText("");
            intensityLabel.setText("-");
            intensityPercentLabel.setText("");
        } else {
            if (originTimeOffset == null) {
                timeRemainingLabel.setText("-");
                distanceLabel.setText("-");
            } else {
                double[] pEvent = GeoCalc.Geo2Cart(event.latitude, event.longitude, -event.depth);
                double[] pTarget = GeoCalc.Geo2Cart(target.latitude, target.longitude, target.altitude);
                double distance = GeoCalc.Distance3D(pEvent, pTarget);
                double eta = distance / vs - originTimeOffset;
                timeRemainingLabel.setText(String.format("%d", (int) (eta / 1000.0)));
                distanceLabel.setText(String.format("%dkm", (int) (distance / 1000.0)));
            }

            Shaking s;
            s = target.shakingValues.get(Shaking.Type.PGA);
            pgaLabel.setText(s == null || s.expectedSI != s.expectedSI ? "-"
                             : String.format("%.2f", s.expectedSI * Application.EarthAcceleration1));
            setPercentile(pgaPercentLabel, s, "%.2f", Application.EarthAcceleration1);

            s = target.shakingValues.get(Shaking.Type.PGV);
            pgvLabel.setText(s == null || s.expectedSI != s.expectedSI ? "-"
                             : String.format("%.2f", s.expectedSI * 100));
            setPercentile(pgvPercentLabel, s, "%.2f", 100);

            s = target.shakingValues.get(Shaking.Type.PSA);
            if (s == null || s.expectedSI != s.expectedSI) {
                psaLabel.setText("-");
            } else {
                psaLabel.setText(String.format("%.1f",
                                               s.expectedSI * Application.EarthAcceleration1));
            }
            setPercentile(psaPercentLabel, s, "%.1f", Application.EarthAcceleration1);

            s = target.shakingValues.get(Shaking.Type.DRS);
            if (s == null || s.expectedSI != s.expectedSI) {
                drsLabel.setText("-");
            } else {
                drsLabel.setText(String.format("%.1f", s.expectedSI * 100));
            }
            setPercentile(drsPercentLabel, s, "%.1f", 100);

            s = target.shakingValues.get(Shaking.Type.Intensity);
            intensityLabel.setText(s == null || s.expectedSI != s.expectedSI
                                   ? "-" : RomanNumber.toString((int) (s.expectedSI + 0.5)));
            intensityPercentLabel.setText(
                    s == null ? "" : RomanNumber.toString((int) (s.percentile84 + 0.5)) + "/"
                                     + RomanNumber.toString((int) (s.percentile16 + 0.5))
            );
        }

        Application app = Application.getInstance();
        if (app != null) {
            app.setTarget(target);
        }

        eventChanged = false;
        timeChanged = false;
        if (graph != null) {
            graph.repaint();
        }
    }

    private void setPercentile(JLabel label, Shaking s, String format, double factor) {
        if (s == null) {
            label.setText("");
        } else {
            label.setText(String.format(format + "/" + format,
                                        s.percentile84 * factor,
                                        s.percentile16 * factor));
        }
    }
}
