/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gephi.project.spi;

import javax.swing.JPanel;
import org.gephi.project.api.Project;

/**
 *
 * @author root
 */
public interface MergeWorkspacesUI { 
    
    public JPanel getPanel();

    public void setup(Project project);

    public void unsetup(Project project);
}
