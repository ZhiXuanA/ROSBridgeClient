/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jilk.ros.rosapi.message;

import com.jilk.ros.message.Message;
import com.jilk.ros.message.MessageType;

/**
 *
 * @author David J. Jilk
 */
@MessageType(string = "rosapi/Topics")
public class Topics extends Message {
    public String[] topics;
}